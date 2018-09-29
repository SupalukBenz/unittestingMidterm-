import unittest

from string_util import remove_duplicate, duplicate

class TestStringUtil(unittest.TestCase):

  def test_duplicate(self):
    self.assertEqual("aaaaa", duplicate("a", 5))


if __name__ == '__main__':
  unittest.main()