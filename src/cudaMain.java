class cudaMain{
	public native void neuronTest();

	static{
		System.load("C:\\Users\\junwen\\Documents\\CUDA\\testing_JNI\\cudaNeuronNetJNITest\\mainTest.dll");
	}

	public static void main(String args[])
	{
		cudaMain test= new cudaMain();
		test.neuronTest();
	}
}