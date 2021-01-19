
public class simpleNeuronNet {
	
	public native void CoordinatesDatset(int batch_size, int number_of_batches);
	public native void NeuralNetwork(double learning_rate);
	public native Const Shape(int x, int y);
	public native void LinearLayer(String name, Shape W_shape);
	

	public static void main(String[] args) {
		

	}

}
