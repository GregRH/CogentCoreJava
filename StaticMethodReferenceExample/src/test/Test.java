package test;

import org.NoteClass;
import org.Noteable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Noteable note = NoteClass::noteSomething;
		note.note("lecture");
	}

}
