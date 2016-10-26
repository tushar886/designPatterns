package com.command.fileUtil;

import com.command.receiver.FileSystemReceiver;
import com.command.receiver.UnixFileSystemReceiver;
import com.command.receiver.WindowsFileSystemReceiver;

public class FileSystemReceiverUtil {
	
	public static FileSystemReceiver getUnderlyingFileSystem() {
		final String osName = System.getProperty("os.name");
		System.out.println("Underlying OS name is " + osName);
		
		if (osName.contains("Windows")) {
			return new WindowsFileSystemReceiver();
		} else {
			return new UnixFileSystemReceiver();
		}
	}
}
