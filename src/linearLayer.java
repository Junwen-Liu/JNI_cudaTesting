
public class linearLayer {
	
	public native linearLayer init(String name, int x, int y) ;
	
	public native void forward(float[] W, float[] A, float[] Z, float[] b, int W_x_dim, int W_y_dim, int dZ_x_dim, int dZ_y_dim);
	
	public native void backprop(float[] dZ, float learning_rate);

	public static void main(String[] args) {
		linearLayer newLL = new linearLayer();
		newLL.init("sample layer", 2, 2);
		float[] W = new float[] {1f, 5f, 3f, 2f};
		float[] A = new float[] {1f, 2f, 1f, 2f};
		float[] Z = new float[] {1f, 3f, 1f, 2f};
		float[] b = new float[] {1f, 5f};
		newLL.forward(W, A, Z, b, 2,2,2,2);
		
		System.out.println("the updated W is " + W.toString());
		System.out.println("the updated A is " + A.toString());
		System.out.println("the updated Z is " +Z.toString());
		System.out.println(" the updated b is " + b.toString());

	}

}


