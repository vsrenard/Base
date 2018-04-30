
public class StringPair(var key: String, var value: String)
{}

public class Base
{
	public var array: MutableList<StringPair> = mutableListOf()
	fun insert(key : String, value : String)
	{
		insert(StringPair(key, value))
	}
	fun insert(a: StringPair)
	{
		array.add(a)
	}
	fun FindByKey(key : String): List<StringPair>
	{
		return array.filter{it.key.contains(key)}
	}
	fun FindByValue(value : String): List<StringPair>
	{
		return array.filter{it.value.contains(value)}
	}
	fun DeleteByKey(key : String)
	{
		array.removeAll{it.key == key}
	}
	fun DeleteByValue(value : String)
	{
		array.removeAll{it.value == value}
	}
}

fun main(args: Array<String>)
{
	var base = Base()
	while (true)
	{
        var input = readLine()!!.split(' ')
        var operation = input[0]
        var str1 = input[1]
        var str2 : String
        if (operation == "insert")
        {
            str2 = input[2]
            base.insert(str1, str2)
        }
        if (operation == "FindByKey")
        {
            var res = base.FindByKey(str1)
            for (p in res)
            {
                println(p.key + " " +  p.value)
            }
        }
        if (operation == "FindByValue")
        {
            var res = base.FindByValue(str1)
            for (p in res)
            {
                println(p.key + " " + p.value)
            }
        }	
        if (operation == "DeleteByKey")
        {
            base.DeleteByKey(str1)
        }
        if (operation == "DeleteByValue")
        {
            base.DeleteByValue(str1)
        }	
        if (operation == "exit")
        {
            break
        }
	}
}
