Проблемы кода:
1. Каждое животное может вызывать все действия, поэтому нужно дополнительно прописывать логику каждого неиспользуемого действия у отдельных животных, задваивая код.
2. Публичные методы в классе - родителе нарушают инкапсуляцию: внутренние детали реализации этих методов могут стать известными всем подклассам.
