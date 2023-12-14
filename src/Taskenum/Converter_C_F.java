package Taskenum;

public class Converter_C_F implements Converter{

    @Override
    public float convert(float tempIn) {
        return (float) (tempIn * 1.8 + 32);
    }
}
