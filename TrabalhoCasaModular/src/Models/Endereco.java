package Models;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String cep;
    private int numero;

    /**
     * Construtor da classe Endereco.
     *
     * @param rua    O nome da rua do endereço.
     * @param bairro O nome do bairro do endereço.
     * @param cidade O nome da cidade do endereço.
     * @param cep    O CEP do endereço.
     * @param numero O número do local do endereço.
     */
    public Endereco(String rua, String bairro, String cidade, String cep, int numero) {
        setRua(rua);
        setBairro(bairro);
        setCidade(cidade);
        setCep(cep);
        setNumero(numero);
    }

    /**
     * Retorna uma representação em string do objeto Endereco.
     *
     * @return Uma representação em string do objeto Endereco.
     */
    @Override
    public String toString() {
        return "Rua: " + getRua() + "\nBairro: " + getBairro() + "\nNúmero: " + getNumero() + "\nCidade: " + getCidade() + "\nCEP: " + getCep();
    }

    /**
     * Obtém o nome da rua do endereço.
     *
     * @return O nome da rua do endereço.
     */
    public String getRua() {
        return this.rua;
    }

    /**
     * Obtém o nome do bairro do endereço.
     *
     * @return O nome do bairro do endereço.
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Obtém o nome da cidade do endereço.
     *
     * @return O nome da cidade do endereço.
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Obtém o CEP do endereço.
     *
     * @return O CEP do endereço.
     */
    public String getCep() {
        return cep;
    }

    /**
     * Obtém o número do local do endereço.
     *
     * @return O número do local do endereço.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define o nome da rua do endereço.
     *
     * @param rua O nome da rua do endereço.
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * Define o nome do bairro do endereço.
     *
     * @param bairro O nome do bairro do endereço.
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * Define o nome da cidade do endereço.
     *
     * @param cidade O nome da cidade do endereço.
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * Define o CEP do endereço.
     *
     * @param cep O CEP do endereço.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Define o número do local do endereço.
     *
     * @param numero O número do local do endereço.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
}