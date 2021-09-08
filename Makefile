default: build

build:
	javac src/*.java

clean:
	rm src/*.class

run: build
	java -cp src Main
