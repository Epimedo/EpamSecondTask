package by.tc.task01.util.factory;

import by.tc.task01.util.read.Input;

public abstract class InputFactory {

	public Input getInput() {
		Input in = createInput();
		return in;
	}

	abstract public Input createInput();
}
