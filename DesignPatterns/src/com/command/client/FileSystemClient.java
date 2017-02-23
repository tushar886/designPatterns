package com.command.client;

import com.command.Commands.CloseFileCommand;
import com.command.Commands.OpenFileCommand;
import com.command.Commands.WriteFileCommand;
import com.command.fileUtil.FileSystemReceiverUtil;
import com.command.invoker.FileInvoker;
import com.command.receiver.FileSystemReceiver;

public class FileSystemClient {

	public static void main(String[] args) {
		
		//Creating the receiver object
		FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

		//creating command and associating with receiver
		OpenFileCommand openFileCommand = new OpenFileCommand(fs);

		//Creating invoker and associating with Command
		FileInvoker file = new FileInvoker(openFileCommand);

		//perform action on invoker object
		file.execute();
		
		WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
		file = new FileInvoker(writeFileCommand);
		file.execute();
		
		CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
		file = new FileInvoker(closeFileCommand);
		file.execute();
	}

}
