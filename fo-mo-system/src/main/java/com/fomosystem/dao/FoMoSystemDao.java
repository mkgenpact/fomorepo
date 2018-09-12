package com.fomosystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.fomosystem.model.FoModel;
import com.fomosystem.model.MoModel;

@Component
public class FoMoSystemDao {
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	public void updateFo(FoModel fomodel) {
		
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				 PreparedStatement fomosystems = con.prepareStatement(
					        "UPDATE fomosystems SET currency = ?,amount=?,buyorsell=?,"
					        + " tradedate=? WHERE tradeid =? and systemname=? ");
				 fomosystems.setString(1, fomodel.getCurrency());
				 fomosystems.setString(2, fomodel.getAmount());
				 fomosystems.setString(3, fomodel.getBuySell());
				 fomosystems.setString(4, fomodel.getTradeDate());
				 fomosystems.setInt(5, Integer.valueOf(fomodel.getTradeID()));
				 fomosystems.setString(6, fomodel.getSystemname());
				 return fomosystems;
			}
		});
		
	}
	
	public void updateMo(MoModel momodel) {

		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement fomosystems = con
						.prepareStatement("UPDATE fomosystems SET currency = ?,amount=?,buyorsell=?,"
								+ " tradedate=?,fees=?,quantity=?,exchange=?,price=?,"
								+ " rate=?,settlementdate=? WHERE tradeid =? and systemname=? ");
				fomosystems.setString(1, momodel.getCurrency());
				fomosystems.setString(2, momodel.getAmount());
				fomosystems.setString(3, momodel.getBuySell());
				fomosystems.setString(4, momodel.getTradeDate());
				fomosystems.setString(5, momodel.getFees());
				fomosystems.setString(6, momodel.getQuantity());
				fomosystems.setString(7, momodel.getExchange());
				fomosystems.setString(8, momodel.getPrice());
				fomosystems.setString(9, momodel.getRate());
				fomosystems.setString(10, momodel.getSettlementDate());
				fomosystems.setInt(11, Integer.valueOf(momodel.getTradeID()));
				fomosystems.setString(12, momodel.getSystemname());
				return fomosystems;
			}
		});

	}
	
	public FoModel loadFoData(int tradeId,String systemname) {
		
		final String foSql = "select * from fomosystems where tradeid = ? and systemname=?";
		List<FoModel>  fomode = jdbcTemplate.query(foSql, new RowMapper<FoModel>() {
			@Override
			public FoModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				FoModel foModel=  new FoModel();
				foModel.setTradeID(rs.getString("tradeid"));
				foModel.setAmount(rs.getString("amount"));
				foModel.setBuySell(rs.getString("buyorsell"));
				foModel.setCounterParty(rs.getString("counterParty"));
				foModel.setSystemname("systemname");
				foModel.setCurrency(rs.getString("currency"));
				foModel.setTradeDate(rs.getString("tradedate"));
				return foModel;
			}
			
		}, tradeId,systemname);
		return (fomode!=null)?fomode.get(0):null;
	}
	
	public MoModel loadMoData(int tradeId,String systemname) {
		
		final String foSql = "select * from fomosystems where tradeid = ? and systemname=?";
		List<MoModel>  momode = jdbcTemplate.query(foSql, new RowMapper<MoModel>() {
			@Override
			public MoModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				MoModel moModel=  new MoModel();
				moModel.setTradeID(rs.getString("tradeid"));
				moModel.setAmount(rs.getString("amount"));
				moModel.setBuySell(rs.getString("buyorsell"));
				moModel.setCounterParty(rs.getString("counterParty"));
				moModel.setSystemname("systemname");
				moModel.setCurrency(rs.getString("currency"));
				moModel.setTradeDate(rs.getString("tradedate"));
				moModel.setFees(rs.getString("fees"));
				moModel.setExchange(rs.getString("exchange"));
				moModel.setPrice(rs.getString("price"));
				moModel.setSettlementDate(rs.getString("settlementdate"));
				return moModel;
			}
			
		}, tradeId,systemname);
		return (momode!=null)?momode.get(0):null;
	}
}