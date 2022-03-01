public class Theater {
    private Seat[][] seats;
    private int rowCount, colCount;

    public Theater(int rowCount, int colCount) {
        // 알파벳은 26개만 존재
        if (rowCount > 26) {
            rowCount = 26;
        }

        // 좌석 배열 생성
        seats = new Seat[rowCount][colCount];

        // 각 seat 인스턴스 생성
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                seats[i][j] = new Seat();
            }
        }

        this.rowCount = rowCount;
        this.colCount = colCount;
    }

    public boolean reserve(String name, char rowChar, int col, int numSeat) {
        int row = getRowIndex(rowChar) + 1;

        if (row > rowCount || col > colCount || col + numSeat - 1 > colCount) {
            return false;
        }

        for (int i = 0; i < numSeat; i++) {
            Seat current = seats[row - 1][col - 1 + i];

            if (current.isOccupied()) {
                for (int j = 0; j < i; j++) {
                    seats[row - 1][col - 1 + j].cancel();
                }
                return false;
            }

            current.reserve(name);
        }

        return true;
    }

    public int cancel(String name) {
        int canceledSeat = 0;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                Seat seat = seats[i][j];

                if (seat.isOccupied() && seat.match(name)) {
                    seat.cancel();
                    canceledSeat++;
                }
            }
        }

        return canceledSeat;
    }

    public int cancel(char rowChar, int col, int numSeat) {
        int row = getRowIndex(rowChar) + 1;

        if (row > rowCount || col > colCount) {
            return 0;
        }

        if (col + numSeat - 1 > colCount) {
            numSeat = colCount - col + 1;
        }

        int canceledSeat = 0;

        for (int i = 0; i < numSeat; i++) {
            if (seats[row - 1][col - 1 + i].isOccupied()) {
                seats[row - 1][col - 1 + i].cancel();
                canceledSeat++;
            }
        }

        return canceledSeat;
    }

    public int getNumberOfReservedSeat() {
        int reservedSeat = 0;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                Seat seat = seats[i][j];

                if (seat.isOccupied()) {
                    reservedSeat++;
                }
            }
        }

        return reservedSeat;
    }

    public void printSeatMatrix() {
        System.out.print("  ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("  " + i);
        }
        System.out.println();

        for (int i = 0; i < rowCount; i++) {
            System.out.print((char) ('A' + i) + ": ");
            for (int j = 0; j < colCount; j++) {
                Seat s = seats[i][j];
                if (s.isOccupied()) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }

    private int getRowIndex(char uppercaseChar) {
        return uppercaseChar - 'A';
    }
}