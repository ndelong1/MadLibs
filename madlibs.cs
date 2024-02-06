/*
                                             C# MadLib Quote is from Les Miserables, Victor Hugo
We are not among those who __sing__ the praises of __war__; we tell the truth about it when the need arises. __War__ has tragic splendors which we have not sought to conceal, but it also has its especial squalors, among which is the prompt stripping of the __bodies__ of the dead. The day following a battle always dawns on __naked corpses__.
*/
using System;
using System.Globalization;


class MadLibs{

    static void Main(String[] args){

        string userName;
        string verbOne;
        string nounOne;
        string nounTwo;
        string nounThree;

        TextInfo ti = CultureInfo.CurrentCulture.TextInfo;


        Console.WriteLine("What is your username? >> ");
        userName = Console.ReadLine();
        Console.WriteLine("Write an infinitive form of a verb (minus the word 'to') >> ");
        verbOne = Console.ReadLine();
        Console.WriteLine("Write a noun >> ");
        nounOne = Console.ReadLine();
        Console.WriteLine("Write another noun >> ");
        nounTwo = Console.ReadLine();
        Console.WriteLine("Write a synonym for the previous noun: (That is still a noun) >> ");
        nounThree = Console.ReadLine();

        string nounOneDotA = ti.ToTitleCase(nounOne);

        Console.WriteLine("We are not among those who " + verbOne + " the praises of " + nounOne + "; we tell the truth about it when the need arises. " + nounOneDotA + " has tragic splendors which we have not sought to conceal, but it also has its especial squalors, among which is the prompt stripping of the " + nounTwo + " of the dead. The day following a battle always dawns on " + nounThree+ ".");

    }
}
        