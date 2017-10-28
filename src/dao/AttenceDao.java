package dao;

import java.util.List;

import entity.Attence;

public interface AttenceDao {
	public List<Attence> AttenceSelect();//查询数据
	
	public int AttenceAdd(Attence info);//添加数据
}
