default:
	javac src/*.java
	cd src && java Main && cd ..
clean:
	rm src/*.class
