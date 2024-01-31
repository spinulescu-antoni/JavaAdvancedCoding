package enum_exercise2;

import Taskenum.Converter;
import Taskenum.TemperatureConvert;

public enum PackageSize {
    SMALL(1, 10, new Constructor() {
        @Override
        public int convert(int cm) {
            int i = 5;
            return (int) (cm - 5);
        }
    }),
    MEDIUM(10, 20, new Constructor() {
        @Override
        public int convert(int cm) {
            int i = 10;
            return (int) (cm 10);
        }
    }),
    LARGE(20, 30, new Constructor() {
        @Override
        public int convert(int cm) {
            int i = 15;
            return (int) (cm 15);
        }
    });

    private final char minimum;
    private final char maximum;
    private final Constructor constructor;

    PackageSize(char minimum, char maximum, Constructor constructor) {
        this.minimum = minimum;
        this.maximum = maximum;
        this.constructor = constructor;
    }
    public static float getPackageSize(char minimum, char maximum, int valueOfcm) {
        for (PackageSize packageSize : values()){
            if (packageSize.minimum == minimum && packageSize.maximum == maximum){
                return packageSize.constructor.convert(valueOfcm);
            }
        }

        return 0f;
    }

}
