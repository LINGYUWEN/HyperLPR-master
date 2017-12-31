package pr.platerecognization;

/**
 * Created by yujinke on 24/10/2017.
 */

public class PlateRecognition {
    static {
        System.loadLibrary("hyperlpr");
    }
    static native long InitPlateRecognizer(String casacde_detection,
                                           String finemapping_prototxt,String finemapping_caffemodel,
                                           String segmentation_prototxt,String segmentation_caffemodel,
                                           String charRecognization_proto,String charRecognization_caffemodel);

    static native long ReleasePlateRecognizer(long  object);
    static native String SimpleRecognization(long  inputMat,long object);

}
