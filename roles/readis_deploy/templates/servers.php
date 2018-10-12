<?php declare(strict_types=1);

return [
    [
        'name'          => 'Redis-Server 1',
        'host'          => '{{swarm_service_ip}}',
        'port'          => 8110,
        'auth'          => null,
        'timeout'       => 2.5,
        'retryInterval' => 100,
        'databaseMap'   => [],
    ],
];