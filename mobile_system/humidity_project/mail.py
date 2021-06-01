import Adafruit_DHT as dht
from time import sleep
import smtplib
from email.mime.text import MIMEText

def sendMail(usermail) :
	#Set DATA pin
	DHT = 4
	while True:
	    #Read Temp and Hum from DHT22
	    h,t = dht.read_retry(dht.DHT22, DHT)
	    #Print Temperature and Humidity on Shell window
	    print('Temp={0:0.1f}*C Humidity={1:0.1f}%'.format(t,h))
	    sleep(5)  #Wait 5 seconds and read again

	    if h>=85 :
	        print('Send Email')
	        smtp = smtplib.SMTP('smtp.gmail.com', 587)
	        smtp.starttls()
	        smtp.login('ayeon1214@gmail.com', 'vflo hdef rssd ekuy')

	        msg = MIMEText('The humidity is over 85%. Turn on the dehumidifier or open the window.')
	        msg['Subject'] = 'Warning! Email from Raspberry'
	        msg['To'] = usermail
	        smtp.sendmail('raspberryPi', usermail, msg.as_string())

