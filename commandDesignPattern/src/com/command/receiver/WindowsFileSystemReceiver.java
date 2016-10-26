package com.command.receiver;

public class WindowsFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("Open fiLE IN Windows");
	}

	@Override
	public void closeFile() {
		System.out.println("Close fiLE IN Windows");
	}

	@Override
	public void writeFile() {
		System.out.println("Write fiLE IN Windows");
	}

}
