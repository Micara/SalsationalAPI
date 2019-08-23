# Makefile
# Salsational 

BIN = bin
GCC = javac

all:
	$(GCC) src/*.java

run:
	java Main

clean:
	@rm bin/*.class