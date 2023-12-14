package Taskenum;

public enum TemperatureConvert {
    C_F('C', 'F', new Converter_C_F()),
    C_K('C', 'K', new Converter_C_K()),
    K_C('K', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) (tempIn - 273.15);
        }
    }),
    F_C('F', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32) * 5 / 9;
        }
    }),
    F_K('F', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) ((tempIn - 32) * 5 / 9 + 273.15);
        }
    }),
    K_F('K', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) ((tempIn - 273.15) * 9 / 5 + 32);
        }
    });
    private char inputTemp;
    private char outputTemp;
    private Converter converter;

    TemperatureConvert(char inputTemp, char outputTemp, Converter converter) {
        this.inputTemp = inputTemp;
        this.outputTemp = outputTemp;
        this.converter = converter;
    }

    public static float convertTemperature(char inputTemp, char outputTemp, float valueOfTemp) {
        for ( TemperatureConvert temperatureConvert : values()){
            if (temperatureConvert.inputTemp == inputTemp && temperatureConvert.outputTemp == outputTemp) {
               return temperatureConvert.converter.convert(valueOfTemp);
            }
        }
        return 0f;
    }
}
