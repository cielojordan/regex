import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTester {

	public static void main(String[] args) {
		
		
//		String s = "Goodbye.cruel.world";
//		
//		String[] data = s.split("|"); // this is a regex  \.
//		
//		System.out.println(Arrays.toString(data));

		String s = "aahhh";
		System.out.println(s.matches("a{2}\\+.*"));
		
		
//		
//		String template = "this banana is a piece bananana.";
//		
//		template = template.replaceAll("ba(na)+", "ashjdsjhd");
//		
//		System.out.println(template);
		
		
		
//		
//
//		String template = "public <type> get<uname>() {return <name>;}";
//		
//		String type = "Integer";
//		String name = "age";
//		String uname = "Age";
//		
//
//		
//		template = template.replaceAll("<type>", type);
//		template = template.replaceAll("<uname>", uname);
//		template = template.replaceAll("<name>", name);
//
//
//		System.out.println(template);
//				
//		String template2 = "public void set<uname>(<type> <name>) {this.<name> = <name>;}";
//
//		template2 = template2.replaceAll("<type>", type);
//		template2 = template2.replaceAll("<uname>", uname);
//		template2 = template2.replaceAll("<name>", name);
//		
//		System.out.println(template2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String regex = "(register|reg)\\s+(.+)\\s+(.+)";
//		
//		System.out.println("BRAATT".matches(regex));
//		System.out.println("at".matches(regex));
//		System.out.println("bat".matches(regex));
//		System.out.println("zat".matches(regex));
		
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher("register jeff jeff2");
		
		if(m.find()) {
			// true
			System.out.println( m.group(1));
			System.out.println( m.group(2));
			System.out.println( m.group(3));
		}
		
		
		
		
//		
//		
		
		Class c = HelloRegex.class;
		Field[] fields = c.getDeclaredFields();
		
		for (Field field : fields)
		{
			if (field.isAnnotationPresent(Properties.class))
			{
				String template = "public <type> get<uname>() {return <name>;}";
				
				String type = field.getType().getSimpleName();
				String name = field.getName();
				String uname = Character.toUpperCase(name.charAt(0)) + name.substring(1);
	
				
				template = template.replaceAll("<type>", type);
				template = template.replaceAll("<uname>", uname);
				template = template.replaceAll("<name>", name);
		
		
				System.out.println(template);
						
				String template2 = "public void set<uname>(<type> <name>) {this.<name> = <name>;}";
		
				template2 = template2.replaceAll("<type>", type);
				template2 = template2.replaceAll("<uname>", uname);
				template2 = template2.replaceAll("<name>", name);
				
				System.out.println(template2);
			}
		}		
		
	}

}
