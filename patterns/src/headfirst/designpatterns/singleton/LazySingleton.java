package headfirst.designpatterns.singleton;

public class LazySingleton {
    private static volatile LazySingleton lazySingleton;

    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if (null == lazySingleton){
            synchronized (LazySingleton.class){
                if (null == lazySingleton){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
