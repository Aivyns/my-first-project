// ���� demo1.java
// �����i��� ���������i� ������ �1
class demo1 {
	public static void main(String argv[]) {
		// �����i��� ������� ������������ �� �����i� �������
		Animal a1 = new Animal();
		AnimalRepres ar = Animal.getTerminalRepres();
		a1.setKind("����i�� �i���");
		a1.setName("����");
		a1.setYear(2015);
		a1.setSex('F');
		a1.setWeight(250.0);
		a1.setLivetime((short) 20);
		a1.setRarity((short) 4);
		System.out.println(a1.getKind() + " " + a1.getName() + " "
				+ a1.getYear() + " " + a1.getSex() + " " + a1.getWeight() + " "
				+ a1.getLivetime() + " " + a1.getRarity());
		// �����i��� ������� ������������ �� ������ toString
		Animal a2 = new Animal("���� ������������", "���i�������", 2000, 'M',
				170.0, (short) 12, (short) 3);
		System.out.println(a2);
		// �����i��� �������� �����������i� i ������ printCard
		Animal a3 = new Animal("i��i�", "�����i��", 2003, 'F', 47.0,
				(short) 12, (short) 3);
		Animal a4 = new Animal("����� �i���", "��i������", 2003, 'M', 0.4,
				(short) 5, (short) 0);
		//ar.printCard(a3);
		ar.printCard(a4);
		// �����i��� ������� ������������ i ������ kbInput
		Animal a5 = new Animal();
		if (!AnimalRepres.kbInput(a5))
			a5 = new Animal();
		// �����i��� ������ printLine
		ar.printLine(a1);
		ar.printLine(a2);
		ar.printLine(a3);
		ar.printLine(a1);
		ar.printLine(a5);
		// �� ������i �������� �� �����i ������ � 5 ����i�
		// � �i����� �����������
	}
}
