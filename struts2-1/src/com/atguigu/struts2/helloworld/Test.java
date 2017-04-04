package com.atguigu.struts2.helloworld;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;
import java.util.Map;


public class Test {
   public static void main(String[] args) {
	
	    Map<String,String> map = new HashMap<>();
	    map.put("name", "jane");
	    map.put("age","12");
	    map.put("sex", "女");
	    
	    Map<String,String> map1 = new HashMap<>();
	    map1.put("name", "jeo");
	    map1.put("age","12");
	    map1.put("sex", "男");
	    
	    List<Map<String,String>> maplist = new ArrayList<Map<String,String>>();
	    maplist.add(map);
	    maplist.add(map1);
	    
	    /**
	     * list看做是一个“水杯”，
	     * List<String> list =null;这种情况是没有“水杯”，
	     * list==null;当然是true，
	     * list.size();就会报错，因为没有水杯怎么会有长度。
	     */
	    
	    /**
	     * list看做是一个“水杯”，
	     * List<String> list = new ArrayList<String>();这种情况是有一个空“水杯”，
	     * list==null;当然是false，因为已经有水杯了
	     * list.size();长度为0，因为是空水杯
	     */
	    
	    
	    List<String> list =null;//	 
	    System.out.println(list==null);//true
	    System.out.println(list.size());//java.lang.NullPointerException
	    
	    /**
	     * Map<k.v>接口：
	     * 方法：
	     * 1、map.size()，返回值是int，map的长度；
	     * 2、map.isEmpty()，返回值是boolean，判断map为空，为空返回true，不空返回false
	     * 3、map.containskey(key)，返回值是boolean，判断map里是否包含某个key值，包含返回true，否则返回false，key的类型是Object
	     * 4、map.containsvalue(value)，返回值是boolean，判断mp里是否包含某个value值，包含返回true，否则返回false，value的类型是Object
	     * 5、map.get(key)，返回值是Object，获取键为key的值，如果没有这个key，返回null，如果为空，就返回空
	     * 6、map.put(k,v)，返回值是v，或者是null；如果原来不存在这个key值，就返回为null，如果原来就存在这个key值，就返回key原来对应value的值，不管value值是否被替换。
	     * 7、map.remove(key)，返回值是v，删除map里这个key值对应的键和值，返回value值
	     * 8、map.putAll(Map<>)，返回值为void，将一个map方剂另一个map里，若果有相同的key，值就会被覆盖，key不同就会合并
	     * 9、map.clear()，返回值是void，清空map的所有映射
	     * 10、keySet()，返回值是Set<K>集合，获取map的key的集合，Set<k>里面的类型根据定义的HashMap的key值的类型而定
	     * 11、 values()，返回值Collection<V>集合，获得map的value的集合，Collection<V>里面的类型根据定义的HashMap的value值的类型而定。
	     * 12、 entrySet()，返回值Set<Map.Entry<K, V>>集合，集合元素的类型是Map.Entry<k,v>,
	     * 13、
	     */      
	    /* 
	    map.putAll(map1);
	    System.out.println(map.get("name"));
	    System.out.println(map.isEmpty());
	    System.out.println(map.containsKey("name"));
	    System.out.println(map.containsValue("jane"));
	    System.out.println(map.get("school"));//map里没有school这个键，就返回为空
	    System.out.println( map.put("sex", "女"));
	    System.out.println( map.put("sex", "男"));
	    System.out.println(map.get("sex"));
	    System.out.println(map.size());
	    System.out.println(map.remove("sex"));
	    System.out.println(map.size());
	    map.clear();
        */
	   
	    /**
	     * Set<E> 接口：集合，extends Collection<E>
	     * E是集合元素的类型
	     * 方法（11）：
	     * 1、size()，返回值是int，获得集合的元素的个数
	     * 2、isEmpty()，返回值是boolean，判断集合是否为空，为空返回true，不空返回false
	     * 3、contains(Object)，返回值是booean，判断是否包含某个元素，包含返回true，不半酣返回false
	     * 4、iterator()，返回值是Iterator<E>，E是集合元素类型，返回一个集合的迭代器
	     * 
	     */ 
//	    传统的遍历map的方法（使用for循环遍历）：每次从map中取得关键字，然后要重新返回到map里取得相应的值，这样很繁琐、费时。
//	    获取map所有的key值,map.keySet()返回一个Set<Object>集合。
//	  Set<String> keys = map.keySet();	 
//	  System.out.println(keys.isEmpty());
//	  System.out.println(keys.contains("sex"));
//	    if(keys.size()>0){
//	    for(String key:keys){
//	    	System.out.println(key+"-->"+map.get(key));
//	      }
//	    }
 /**
  * Iterator<E>接口：
  * 方法：E是类型
  * 1、 hasNext()返回值是boolean，判断是否有下一个元素，有则返回true，没有则返回false
  * 2、next()返回值是E，返回集合元素的类型，获得下一个元素
  * */
//	   传统的遍历map的方法（使用迭代器Iterator<E>接口）： 
//		    Set<String> keys = map.keySet( );
//		    if(keys.size()>0) {
//		    	Iterator<String> iterator = keys.iterator( );
//		    	while(iterator.hasNext( )) {
//		    		Object key = iterator.next( );
//		    		Object value = map.get(key);
//		    	    System.out.println(key+"-->"+value);	
//		    	}
//		    }
		   
//	    Collection<String> values = map.values();
//		System.out.println(values.size());
//		for(String value:values){
//			System.out.println(value);
//			
//		}
	  /**
	   *Entry<K,V>接口：
	   *Map是java中的接口，Map.Entry是Map的一个内部接口：Map.Entry<K, V>
	   *java.util.Map.Entry接口主要就是在遍历map的时候用到
	   *Map.Entry是Map声明的一个内部接口，此接口为泛型，定义为Entry<K,V>。
	   *它表示Map中的一个实体（一个key-value对）。接口中有getKey(),getValue()方法。
	   *方法： 
	   *1、getKey()，返回值类型是K 
	   *2、getValue()，返回值类型是V
	   * */  
//	    Map.entrySet()返回的是 Map.Entry<K,V>类型的集合。Map.Entry本身不是Collection
//	    for(Map<String,String> paramMap : maplist){
//	    	for(Map.Entry<String, String> mapEntry:paramMap.entrySet()){
//		    	System.out.println(mapEntry.getKey()+"-->"+mapEntry.getValue());	    	
//		    }
//	    }
	    
	  
//	  for循环和Iterator结合使用：  
//	    for(Iterator<Map.Entry<String, String>> i = map.entrySet().iterator();i.hasNext();){
//	    	Map.Entry<String, String> mm = i.next();
//	    	System.out.println(mm.getKey()+"-->"+mm.getValue());
//	    }  
}
}
