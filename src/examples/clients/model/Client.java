package examples.clients.model;

public class Client {
    private Integer id;
    private String firstName;
    private String cpf;
    private String phone;

    public Client() {
    }
    
    public Client(String firstName, String cpf, String phone) {
        this.firstName = firstName;
        this.cpf = cpf;
        this.phone = phone;
    }
    
    public Client(Integer id, String firstName, String cpf, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.cpf = cpf;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "id=" + id + ", firstName=" + firstName + ", cpf=" + cpf + ", phone=" + phone;
    }
}
