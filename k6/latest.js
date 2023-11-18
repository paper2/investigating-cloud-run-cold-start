import http from 'k6/http';
import { sleep } from 'k6';

export default function () {
  const params = {
    timeout: 320000
  };
  http.get('https://latest---test-ldzn4qvhgq-an.a.run.app');
  sleep(0.1);
}
