from flask import Flask, render_template, request, url_for
import os
import sys
sys.path.append(os.path.dirname(os.path.abspath(os.path.dirname(__file__))))
import mail

global usermail
usermail="."

def shutdown_server():
    func = request.environ.get('werkzeug.server.shutdown')
    if func is None:
        raise RuntimeError('Not running with the Werkzeug Server')
    func()

app = Flask(__name__)

@app.route('/')
def start():
	return render_template('index.html')

@app.route('/result', methods = ['POST', 'GET'])
def result():
	if request.method == 'POST':
		result = request.form
		global usermail
		usermail = request.form['email']
		return render_template('result.html', result=result)

@app.route('/background_send_mail')
def background_send_mail():
	mail.sendMail(usermail)
	return 0;

@app.route('/background_terminate')
def background_terminate():
	shutdown_server()
	return 'Server shutting down...'

if __name__ == '__main__':
	app.run(debug=True, port=3000, host='0.0.0.0')
