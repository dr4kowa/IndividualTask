public class prodavec {

    public void modify(Telephone telephone) {
        String TeleMark = telephone.getTelephoneMark();
        String TeleModel = telephone.getTelephoneModel();
        TeleMark = TeleMark.replace('o', 'a');
        TeleModel = TeleModel.replace('o', 'a');
        if (TeleMark.charAt(0) != 'N' && TeleMark.charAt(0) != 'n') {
            TeleMark = TeleMark.toUpperCase();
        }
        if (TeleModel.charAt(0) != 'N' && TeleModel.charAt(0) != 'n') {
            TeleModel = TeleModel.toUpperCase();
        }
        telephone.setTelephoneModel(TeleModel);
        telephone.setTelephoneMark(TeleMark);
    }

}
