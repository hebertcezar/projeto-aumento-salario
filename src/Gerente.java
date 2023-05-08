public class Gerente extends Funcionario{
    @Override
    public double aumentoSalario() {
        return getSalario()+(getSalario()*0.1);
    }
}
