public class House{
    public string Address { get; set; }
    public int NumberOfRooms { get; set; }

    public void Main() {
    House house = new House();}
        house.Address = "123 Main St";
        house.NumberOfRooms = 3;
        System.Console.WriteLine("House at " + house.Address + " has " + house.NumberOfRooms + " rooms.");
}