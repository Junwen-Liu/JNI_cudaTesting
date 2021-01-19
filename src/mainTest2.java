
import java.io.Console;
import java.util.*;

class mainTest2{
	public native boolean simpleNN(Map<Integer, int[][]> testmap);
//	public native boolean simpleNN(int numOfLayers, int[][] layerSepcs);
	
	static{
		System.load("C:\\Users\\junwen\\Documents\\CUDA\\testing_JNI\\cudaNeuronNetJNITest2\\mainTest.dll");
	}

    public static void main(String args[]) {
        mainTest2 test = new mainTest2();
        
        //construct the Neuron Network
        //In HashMap, Integer represent number of layer
        //in HashMap, int[0] specify:
        	// 0: linear layer, int[1] indicates number of input neuron, int[2] indicates number of output neuron.
        	// 1: relu layer
        	// 2: sigmoid layer
        
        Map<Integer, int[]> layerSpecs = new HashMap<Integer, int[]>();
        layerSpecs.put(0, new int[] {0, 2, 30}); //linear layer, input 2 neuron, output 30 neuron
        layerSpecs.put(1, new int[] {1}); //relu layer
        layerSpecs.put(2, new int[] {0, 30, 1}); //linear layer, input 30 neuron, output 2 nueron
        layerSpecs.put(3, new int[] {2}); //sigmoid layer
        
//        int numOfLayers = 4;
//        int[][] layersSpecs = {{0,2,30}, {1}, {0, 30, 1}, {2}};
        
        
//        boolean result = test.simpleNN(numOfLayers, layersSpecs);
        boolean result = test.simpleNN(layerSpecs);
        String checkresult = result ? "This cuda program has been running successfully": "This cuda program has failed";
        System.out.println("Checking if GPU CUDA program has been running successfully:  \n" + checkresult);
    }
}

