public class Programador extends Funcionario{
    @Override
    public double aumentoSalario() {
        return getSalario()+(getSalario()*0.2);
    }
}
