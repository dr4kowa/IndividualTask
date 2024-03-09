public class Telephone {
    private String TelephoneMark;
    private String TelephoneModel;

    public Telephone(String TelephoneMark, String TelephoneModel) {
        this.TelephoneMark = TelephoneMark;
        this.TelephoneModel = TelephoneModel;
    }

    public String getTelephoneModel() {
        return TelephoneModel;
    }

    public void setTelephoneModel(String telephoneModel) {
        TelephoneModel = telephoneModel;
    }

    public String getTelephoneMark() {
        return TelephoneMark;
    }

    public void setTelephoneMark(String telephoneMark) {
        TelephoneMark = telephoneMark;
    }
    @Override
    public String toString(){
        return "Telephone = { TelephoneMark = " + TelephoneMark +
                " TelephoneModel = " + TelephoneModel + "}";
    }
}
