/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.util.List;

public interface Value extends SQLFragment,Comparable{

	public Comparable<?> eval();
	public Comparable<?> getVal(List<Object> args);
}