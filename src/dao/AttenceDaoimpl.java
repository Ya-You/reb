package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Attence;

public class AttenceDaoimpl extends BaseDao implements AttenceDao{
	public List<Attence> AttenceSelect(){
		List<Attence> list=new ArrayList();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Attence baen=null;
		try {
			conn=getConnection();
			String sql="select * from attence order by chkdate desc";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while (rs.next()) {
				Attence add=new Attence();
				add.setId(rs.getInt("id"));
				add.setEmpname(rs.getString("empname"));
				add.setDept(rs.getString("dept"));
				add.setChkdate(rs.getDate("chkdate"));
				add.setStatus(rs.getString("status"));
				list.add(add);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			closeAll(conn, ps, rs);
		}
		return list;
	}
	public int AttenceAdd(Attence info){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int i=0;
		try {
			conn=getConnection();
			String sql="insert attence values(?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1,info.getEmpname());
			ps.setString(2,info.getDept());
			ps.setString(3,info.getChkdates());
			ps.setString(4,info.getStatus());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeAll(conn, ps, rs);
		}
		return i;
	}
}
