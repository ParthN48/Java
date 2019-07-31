class HtmlString{
    public static void main(String args[])
    {
        String htmlTag = args[0];
        int flag = 1;
        for(int i = 0; i < htmlTag.length(); i++)
        {
            if(htmlTag.charAt(i) == '<')
                flag = 0;

            else if(htmlTag.charAt(i) == '>')
                flag = 1;

            else if(flag == 1)
                System.out.print(htmlTag.charAt(i));
        }
        System.out.println();
    }
}