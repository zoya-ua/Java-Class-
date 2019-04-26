package com.constructorReview;

public class GameConsole {
String controller;
int numberOfControler;
String powerSource;
boolean cd;
boolean ifTvNeeded;
void ableToPlay() {
	System.out.println("I can play");
}
void readDisk() {
	System.out.println("I can read disk");
}
boolean surfWeb() {
	return true;
}
boolean portable() {
	return true;
}
}
