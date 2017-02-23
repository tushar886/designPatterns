package com.command.receiver;

public class UnixFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("Open fiLE IN Unix");
	}

	@Override
	public void closeFile() {
		System.out.println("Close fiLE IN Unix");
	}

	@Override
	public void writeFile() {
		System.out.println("Write fiLE IN Unix");
	}

}
