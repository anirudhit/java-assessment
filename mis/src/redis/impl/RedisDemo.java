package redis.impl;

import redis.clients.jedis.Jedis;

public class RedisDemo {

	public static void main(String[] args) {
		
		String host = "localhost";
		
		Jedis jedis = new Jedis(host);
		System.out.println("Connection successful");
		System.out.println("Server ping: "+jedis.ping());
		System.out.println("Server info: "+jedis.info());
		
		//Setting List with key and value
		System.out.println("List push with key,value: "+jedis.lpush("apple", "red"));
		jedis.lpush("apple", "red");
		
		//Fetching List value with key
		System.out.println("List pop with key(apple): "+ jedis.lpop("apple"));
		
		//Setting Set with key and value
		System.out.println("Set push with key,value: "+jedis.sadd("lemon", "yellow"));
		jedis.lpush("apple", "red");
		
		//Fetching Set value with key
		System.out.println("Set pop with key(lemon): "+ jedis.spop("lemon"));
		
		jedis.close();
	}

}
