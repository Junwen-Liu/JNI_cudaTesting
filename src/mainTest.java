import java.io.Console;
import java.util.*;

class mainTest{
	public native void neuronTest();

	static{
		System.load("C:\\Users\\junwen\\Documents\\CUDA\\testing_JNI\\cudaNeuronNetJNITest\\mainTest.dll");
	}

	public static void main(String args[])
	{
		mainTest test= new mainTest();
		test.neuronTest();
	}
}

