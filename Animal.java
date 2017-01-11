// ���� Animal.java 
// ���������� ����� �������    
public class Animal {
	private String kind = ""; // ����� ����
	private String name = ""; // i�'� �������
	private int year = -1; // �i� ����������
	private char sex = ' '; // �����
	private double weight = 0; // ����
	private short livetime = -1; // ������i��� ����� ���� � �����i
	private short rarity = 0; // �������i� �i�����i ����

	// -------------------------------------------------------
	// ������������
	// -------------------------------------------------------
	// "������" �����������
	Animal() {
	}

	// -------------------------------------------------------
	// "������" �����������
	Animal(String kind, String name, int year, char sex, double weight,
			short livetime, short rarity) {
		this.name = name;
		this.kind = name;//kind;
		this.year = year;
		this.sex = sex;
		this.weight = weight;
		this.livetime = livetime;
		this.rarity = rarity;
	}

	// -------------------------------------------------------
	// ����������� ��� livetime
	Animal(String kind, String name, int year, char sex, double weight,
			short rarity) {
		this(name, kind, year, sex, weight, (short) -1, rarity);
	}

	// -------------------------------------------------------
	// ����������� ��� livetime � ��� rarity
	Animal(String kind, String name, int year, char sex, double weight) {
		this(name, kind, year, sex, weight, (short) -1, (short) -1);
	}

	// -------------------------------------------------------
	// ������ ������� �� ���i� ����� (��������)
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setLivetime(short livetime) {
		this.livetime = livetime;
	}

	public short getLivetime() {
		return livetime;
	}

	public void setRarity(short rarity) {
		this.rarity = rarity;
	}

	public short getRarity() {
		return rarity;
	}

	// -------------------------------------------------------
	// ������������ �� �����
	public String toString() {
		return kind + " " + name + " " + sex + " " + year + " " + weight + " "
				+ livetime + " " + rarity;
	}

	// -------------------------------------------------------
	// ��������� ���������� �����-������������
	public static AnimalRepres getTerminalRepres() {
		return AnimalRepres.getInstance();
	}
}
