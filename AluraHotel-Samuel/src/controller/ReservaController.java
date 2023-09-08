package controller;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;

import dao.ReservaDAO;
import factory.ConnectionFactory;
import modelos.Reservas;

public class ReservaController {

    private ReservaDAO reservaDAO;

    public ReservaController() {
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.reservaDAO = new ReservaDAO(connection);
    }

    public void cadastrar(Reservas reserva) {
        this.reservaDAO.cadastrar(reserva);
    }

    public Reservas buscarPorId(int id) {
        return reservaDAO.buscarReservaPorId(id);
    }

    public void deletarReserva(int id) {
        reservaDAO.deletar(id);
    }

    public void alterarReserva(Date dataE, Date dataS, BigDecimal valor, String formaPagamento, Integer id){
        this.reservaDAO.alterar(dataE,dataS,valor,formaPagamento,id);
    }
}