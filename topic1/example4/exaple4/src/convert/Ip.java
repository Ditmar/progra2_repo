package convert;

public class Ip {
    private String ip;
    public Ip (String ip) {
        this.ip = ip;
    }
    private String filledZeroToBinary(String binary) {
        binary = String.format("%8s", binary).replace(" ", "0");
        return binary;
    }
    private StringBuilder removeLastCharacter(StringBuilder binaryIp) {
        binaryIp = binaryIp.delete(binaryIp.length() - 1, binaryIp.length());
        return binaryIp;
    }
    public String convertToBinary() {
        // 192.168.1.1
        StringBuilder result = new StringBuilder("");
        String[] splitNumbers = this.ip.split("\\.");
        for (Integer i = 0; i < splitNumbers.length; i++) {
            Integer number = Integer.parseInt(splitNumbers[i]);
            String binary = Integer.toString(number, 2);
            binary = filledZeroToBinary(binary);
            result.append(binary + ".");
        }
        removeLastCharacter(result);
        return result.toString();
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
}
