import java.time.LocalDateTime;

public class Agendamento extends Paciente {
    private int id = 0;
    private String tipoExame;
    private LocalDateTime dataHoraAgendamento;
    private LocalDateTime dataCriacao;
    private String status; // Ex: Confirmado, Pendente, Cancelado
    private String medicoResponsavel;
    private String unidadeExame;
    private String observacoes;
    private String formaPagamento;

    public Agendamento() {
        this.dataCriacao = LocalDateTime.now();
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public LocalDateTime getDataHoraAgendamento() {
        return dataHoraAgendamento;
    }

    public void setDataHoraAgendamento(LocalDateTime dataHoraAgendamento) {
        this.dataHoraAgendamento = dataHoraAgendamento;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(String medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public String getUnidadeExame() {
        return unidadeExame;
    }

    public void setUnidadeExame(String unidadeExame) {
        this.unidadeExame = unidadeExame;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}