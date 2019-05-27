public class Birtvi {
    private Medium medium;

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public void addAmount(String client, int amount) throws MediumException {

        long balance = getBalance(client);
        if (balance + amount < 0) {
            MediumException ex = new MediumException();
            ex.setMessage("tanxa arasakmarisia");
            throw ex;
        }
        medium.write(client, Long.toString(balance + amount));
    }

    public void getAmount(String client, int amount) throws MediumException {
        addAmount(client, -amount);
    }

    public void transferAmount(String fromClient, String toClient, int amount) throws MediumException {
        getAmount(fromClient, amount);
        addAmount(toClient, amount);
    }

    public int getBalance(String client) throws MediumException {
        return Integer.valueOf(medium.read(client));
    }


}
