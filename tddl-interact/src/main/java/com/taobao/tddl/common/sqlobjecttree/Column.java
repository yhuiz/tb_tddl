/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.util.Map;


/**
 * select |column| from
 * @author shenxun
 */
public interface Column extends SQLFragment{
	public String getColumn() ;
	public String getTable() ;
	public String getAlias() ;
	public void setAliasMap(Map<String, SQLFragment> aliasMap);
	public Class getNestClass();

}