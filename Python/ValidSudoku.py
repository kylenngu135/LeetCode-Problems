def rowCheck(row: List[str]) -> bool:
    seen = set()
    for num in row:
        if num in seen:
            return False
        if num != ".":
            seen.add(num)

    return True

def columnCheck(board: List[List[str]], idx: int) -> bool:
    seen = set()
    for row in board:
        if row[idx] in seen:
            return False
        if row[idx] != ".":
            seen.add(row[idx])
    return True

def gridCheck(board: List[List[str]], x: int, y: int) -> bool:
    seen = set()
    startX = x * 3
    startY = y * 3
    for indexX in range(startX, startX+3):
        for indexY in range(startY, startY+3):
            if board[indexX][indexY] in seen:
                return False
            if board[indexX][indexY] != ".":
                seen.add(board[indexX][indexY])
    return True

class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for row in board:
            if not rowCheck(row):
                return False
        
        for num in range(0, 9):
            if not columnCheck(board, num):
                return False

        for x in range(0,3):
            for y in range(0,3):
                if not gridCheck(board, x, y):
                    return False
        return True



