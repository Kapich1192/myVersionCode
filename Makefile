JAVAC= javac
JAVA= java
DC= docker-compose
D= docker

all:
mysql_up:
	sudo ${DC} up
mysql_init:
	sudo ${DC} build
	sudo ${DC} up
mysql_reup:
	sudo ${DC} rm
	sudo ${DC} build
	sudo ${DC} up