package by.tc.task01.util.factory;

import by.tc.task01.util.read.FileInput;
import by.tc.task01.util.read.Input;

public class FileInputFactory extends InputFactory {

	@Override
	public Input createInput() {
		return new FileInput();
	}

}
