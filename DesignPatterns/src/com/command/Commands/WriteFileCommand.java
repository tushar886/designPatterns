package com.command.Commands;

import com.command.receiver.FileSystemReceiver;

public class WriteFileCommand implements Command {
	
	private FileSystemReceiver fileSystemReceiver;

	public  WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
		this.fileSystemReceiver = fileSystemReceiver;
	}
	
	@Override
	public void execute() {
		fileSystemReceiver.writeFile();
	}
}
